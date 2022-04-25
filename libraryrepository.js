import axios from "../custom-axios/axios";
const Libraryservice={
    fetchBooks: () => {
        return axios.get("/api/book");
    },
    addBook: (name, category, author, availableCopies) => {
        return axios.post("/api/book", {
            "name" : name,
            "category" : category,
            "authorId" : author,
            "availableCopies" : availableCopies,
        });
    },
    editBook: (id, name, category, author, availableCopies) => {
        return axios.put(`/api/book/edit/${id}`, {
            "name" : name,
            "category" : category,
            "authorId" : author,
            "availableCopies" : availableCopies,
        });
    },

    fetchAuthor:()=>{
        return axios.get("/api/author")
    },
    deleteBook: (id) => {
        return axios.delete(`/api/book/delete/${id}`);
    },
    markAsTaken: (id) => {
        return axios.post(`/api/book/markAsTaken/${id}`)
    }
}
export default Libraryservice;