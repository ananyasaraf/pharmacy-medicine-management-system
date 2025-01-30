// Example: Validate the "Add Employee" form before submission
document.querySelector("form").addEventListener("submit", function(e) {
    const name = document.querySelector("#name").value;
    const email = document.querySelector("#email").value;
    const role = document.querySelector("#role").value;

    if (!name || !email || !role) {
        alert("All fields are required!");
        e.preventDefault(); // Prevent form submission
    }
});
