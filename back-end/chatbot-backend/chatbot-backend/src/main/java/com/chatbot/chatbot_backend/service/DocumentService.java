package com.chatbot.chatbot_backend.service;

import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.*;
import org.apache.lucene.index.*;
import org.apache.lucene.store.FSDirectory;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

@Service
public class DocumentService {

    private static final String INDEX_DIR = "index";

    public void indexDocuments() throws IOException {
        File docsDir = new File("cdp_docs");
        File[] files = docsDir.listFiles((dir, name) -> name.endsWith(".txt"));

        StandardAnalyzer analyzer = new StandardAnalyzer();
        IndexWriterConfig config = new IndexWriterConfig(analyzer);
        Directory indexDirectory = FSDirectory.open(Paths.get(INDEX_DIR));

        IndexWriter writer = new IndexWriter(indexDirectory, config);
        
        for (File file : files) {
            Document doc = new Document();
            doc.add(new TextField("title", file.getName(), Field.Store.YES));
            doc.add(new TextField("content", new String(java.nio.file.Files.readAllBytes(file.toPath())), Field.Store.YES));
            writer.addDocument(doc);
        }
        writer.close();
    }

    public String search(String queryString) throws IOException {
        // Implement search logic (optional)
        return "Search results for: " + queryString;
    }
}