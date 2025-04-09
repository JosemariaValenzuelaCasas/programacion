document.addEventListener("DOMContentLoaded", function () {
    fetch("https://opulent-cod-5g4j4p6qr5gq34p4r-8085.app.github.dev/v1/api/customer") // Ajusta la URL según tu ruta
      .then(response => response.json())
      .then(data => {
        const tbody = document.getElementById("customer-table-body");
        data.forEach(customer => {
          const row = document.createElement("tr");
          row.innerHTML = `
            <td>${customer.id}</td>
            <td>${customer.dni}</td>
            <td>${customer.firstName}</td>
            <td>${customer.lastName}</td>
            <td>${customer.state}</td>
            `;
          tbody.appendChild(row);
        });
      })
      .catch(error => console.error("Error cargando clientes:", error));
  });
  