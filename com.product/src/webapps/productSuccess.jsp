<html xmlns="http://www.w3.org/1999/html" xmlns="http://www.w3.org/1999/html" xmlns="http://www.w3.org/1999/html">
<head>
<title>Product Details</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet"/>
    <style>
    body {
    background: linear-gradient(#e0c3fc);
    font-family: 'Segoe UI', sans-serif;
    }
    </style>
</head>
<body>
<nav class="navbar navbar-dark bg-dark mb-4">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Product Details</a>
        <a class="btn btn-outline-light" href="index.jsp">Home</a>
    </div>
</nav>
<div class="container d-flex justify-content-center align-items-center min-vh-100">
    <div class="card p-4 shadow" style="width: 150%; max-width: 700px;">
<div class="container">
    <h2 class="text-center text-success">${message}</h2>
    <table class="table table-bordered border-dark">
    <thead class="table-dark text-center">
    <h1 align="center">Thank You!</h1>
    <tr>
        <th scope="col">Field</th>
        <th scope="col">Value</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>Name</td>
        <td>${ProductDto.name}</td>
    </tr>
    <tr>
        <td>Type</td>
        <td>${ProductDto.type}</td>
    </tr>
    <tr>
        <td>Incoming Price</td>
        <td>${ProductDto.incomingPrice}</td>
    </tr>

    <tr>
        <td>Selling Price</td>
        <td>${ProductDto.sellingPrice}</td>
    </tr>
    <tr>
        <td>MRP</td>
        <td>${ProductDto.mrp}</td>
    </tr>
    <tr>
        <td>Description</td>
        <td>${ProductDto.description}</td>
    </tr>
    <tr>
        <td>Brand</td>
        <td>${ProductDto.brand}</td>
    </tr>
    <tr>
        <td>Quantity</td>
        <td>${ProductDto.quantity}</td>
    </tr>
    <tr>
        <td>Color</td>
        <td>${ProductDto.color}</td>
    </tr>
    <tr>
        <td>Weight</td>
        <td>${ProductDto.weight}</td>
    </tr>
    <tr>
        <td>Manufacture Date</td>
        <td>${ProductDto.manfDate}</td>
    </tr>
    <tr>
        <td>Warranty</td>
        <td>${ProductDto.warranty}</td>
    </tr>
    <tr>
        <td>Return Policy</td>
        <td>${ProductDto.returnPolicy}</td>
    </tr>
    </tbody>
</body>
</div>
</div>
</div>
</html>