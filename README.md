CDP Chatbot Project <br>
This project is a chatbot application that answers "How-to" questions related to four Customer Data Platforms (CDPs): Segment, mParticle, Lytics, and Zeotap. The backend is built using Spring Boot, and the frontend is built using React.js. The chatbot extracts information from documentation files (stored as text files) and processes user queries to provide answers.

Technologies Used
Backend:

Spring Boot: A framework for building Java-based applications.
Lucene: A powerful Java-based search library used for indexing and searching text.
Lombok: Java library for reducing boilerplate code (getters, setters, constructors).
H2 Database (optional): If you want to add persistent storage for user queries or responses.
Frontend:

React.js: A JavaScript library for building user interfaces.
Axios: A promise-based HTTP client for making requests from the frontend to the backend.
Features
How-to questions: The chatbot can respond to questions like:

"How do I set up a new source in Segment?"
"How can I create a user profile in mParticle?"
"How do I build an audience segment in Lytics?"
"How can I integrate my data with Zeotap?"
Document indexing: The backend indexes documentation files (e.g., .txt files for each CDP) and returns relevant information to the user.

NLP processing (basic): The backend uses simple string matching to process user queries, but it can be extended with more advanced NLP techniques.

React frontend: User-friendly interface for asking questions and receiving responses from the chatbot.

Cross-CDP comparisons: The chatbot can compare processes between different CDPs (e.g., how Segment’s audience creation process compares to Lytics’).
