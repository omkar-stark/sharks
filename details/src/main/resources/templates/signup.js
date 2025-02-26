const userData = {
    "userName": "Omkar",
    "emailId": "vOmkar@gmail.com",
    "mobileNumber":"9966696148",
    "password":"Test@123"
};

fetch("http://localhost:8080/api/signup", {
    method: "POST",
    headers: {
        "Content-Type": "application/json"
    },
    body: JSON.stringify(userData)
})
.then(response => response.json())
.then(data => console.log("Success:", data))
.catch(error => console.error("Error:", error));