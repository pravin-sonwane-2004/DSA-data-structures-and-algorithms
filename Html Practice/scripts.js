const tbody = document.getElementById("tableBody");
const see = document.getElementById("see-data");

async function fetchData() {
    try {
        const response = await fetch("http://localhost:8080/api/users/getall");
        const data = await response.json();

        // Clear existing content before adding new data

        // Use a loop to iterate through the array of users
        data.forEach(user => {
            const row = `<tr> 
                <td>${user.id}</td>
                <td>${user.name}</td>
                <td>${user.email}</td>
                <td>${user.phone}</td>
            </tr>`;
            tbody.innerHTML += row;
        });
    } catch (error) {
        console.error("Error fetching data:", error);
    }
}

// Pass the function reference without parentheses ()
see.addEventListener("click", fetchData);
