import React, { useState } from "react";
import axios from "axios";

const Chatbot = () => {
  const [query, setQuery] = useState("");
  const [response, setResponse] = useState("");

  const handleSubmit = async (event) => {
    event.preventDefault();

    try {
      const res = await axios.post("http://localhost:8080/api/chatbot/ask", query, {
        headers: {
          "Content-Type": "text/plain",
        },
      });
      setResponse(res.data);
    } catch (error) {
      setResponse("Error: Unable to process your request.");
    }
  };

  return (
    <div>
      <h1>CDP Chatbot</h1>
      <form onSubmit={handleSubmit}>
        <input
          type="text"
          value={query}
          onChange={(e) => setQuery(e.target.value)}
          placeholder="Ask a question..."
        />
        <button type="submit">Ask</button>
      </form>
      <div>
        <p><strong>Response:</strong> {response}</p>
      </div>
    </div>
  );
};

export default Chatbot;
