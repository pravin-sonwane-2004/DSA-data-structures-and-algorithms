const tablebody =  document.getElementById("tablebody");
const submit = document.getElementById("submit");

async function fetchFata() {
    var count = 0;
    const response = await fetch("http://localhost:8080/api/users/getall");
    if(!response.ok) {
        throw new Error("Cant Fetch Data");
    }
    else {

        const data = await response.json();
    console.log("button clicked")

    data.forEach(element => {
        tablebody.innerHTML += `<tr>  
            <td>${element.id}</td>
            <td>${element.name}</td>
            <td>${element.email}</td>
            <td>${element.phone}</td>
        </tr>`;
        count++;
    });
    if(count == 0) {
        document.createTextNode("No data Exista");
    }
    }
} 

submit.addEventListener("click", fetchFata);