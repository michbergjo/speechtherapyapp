//for a bar chart 
new Chart(document.getElementById("myBarChart"), {
    type: 'bar',
    // The data for our dataset
    data: {
        labels: ['January', 'February', 'March', 'April', 'May'],
        datasets: [{
            label: 'My First dataset',
            backgroundColor: ["#80ffff", "#80ccff", "#1a75ff", "#0000e6", "#0000b3"],
            borderColor: 'rgb(255, 99, 132)',
            data: [12, 10, 5, 12, 20]
        }]
    },

    // Configuration options go here
    options: {}
});