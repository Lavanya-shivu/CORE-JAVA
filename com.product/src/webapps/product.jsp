<!Doctype html>
<html lang ="en">
<head>
    <meta charset="UTF-8">
    <title>License Details</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO" crossorigin="anonymous"></script>
    <style>
        body {
        background: linear-gradient(#e0c3fc);
        font-family: 'Segoe UI', sans-serif;
        }
    </style>
</head>
<style>
    .form-control,
    .form-select,
    .form-control:focus,
    .form-select:focus,
    textarea.form-control {
      border: 2px solid #000;
      box-shadow: none;
    }
</style>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark .text-white">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Xworkz</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
            <div class="navbar-nav">
                <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
            </div>
        </div>
    </div>
</nav>

<div class="container d-flex justify-content-center align-items-center min-vh-100">
    <div class="card p-4 shadow" style="width: 110%; max-width: 500px;">
        <div align="center">
            <h1>Check Your Product Here!</h1>
        </div>
        <h3 class="text-danger" align="center">${message}</h3>
<form action="product" method="post">
    <div class="mb-3">
        <label for="name" class="form-label">Name</label>
        <input type="text" class="form-control" id="name" name="name" placeholder="Enter Product Name">
    </div>
    <div class="mb-3">
        <label class="form-label">Type</label>
    <select class="form-select" name= "type" aria-label="Default select example">
        <option selected>Open this select type</option>
        <option value="Mobile Phones">Mobile Phones</option>
        <option value="Laptop">Laptop</option>
        <option value="Skincare">SkinCare</option>
        <option value="clothing">Clothing</option>
    </select>
    </div>
    <div class="mb-3">
        <label for="incomingPrice" class="form-label">Incoming Price</label>
        <input type="number" class="form-control" id="incomingPrice" name="incomingPrice" placeholder="Enter IncomingPrice">
    </div>
    <div class="mb-3">
        <label for="sellingPrice" class="form-label">Selling Price</label>
        <input type="number" class="form-control" id="sellingPrice" name="sellingPrice" placeholder="Enter Selling Price">
    </div>
    <div class="mb-3">
        <label for="mrp" class="form-label">MRP</label>
        <input type="number" class="form-control" id="mrp" name="mrp" placeholder="Enter MRP">
    </div>
    <div class="mb-3">
            <label class="form-label">Description</label>
        <textarea class="form-control" name="description" placeholder="Product Description" id="floatingTextarea2" style="height: 100px"></textarea>
        <label for="floatingTextarea2">Product Description</label>
    </div>
    <div class="mb-3">
        <label for="brand" class="form-label">Brand</label>
        <input type="text" class="form-control" id="brand" name="brand" placeholder="Enter Brand">
    </div>
    <div class="mb-3">
        <label for="quantity" class="form-label">Quantity</label>
        <input type="number" class="form-control" id="quantity" name="quantity" placeholder="Enter Quantity">
    </div>
    <div class="mb-3">
        <label class="form-label">Color</label>
    <select class="form-select" name= "color" aria-label="Default select example">
        <option selected>Open this select color</option>
        <option value="Black">Black</option>
        <option value="White">White</option>
        <option value="Blue">Blue</option>
        <option value="Gray">Gray</option>
    </select>
    </div>
    <div class="mb-3">
        <label for="weight" class="form-label">Weight</label>
        <input type="number" class="form-control" id="weight" name="weight" placeholder="Enter Weight">
    </div>
    <div class="mb-3">
        <label for="manfDate" class="form-label">Manufacture Date</label>
        <input type="date" class="form-control" id="manfDate" name="manfDate" placeholder="Enter Manufacture Date">
    </div>
    <div class="mb-3">
        <label class="form-label">Warranty</label>
    <select class="form-select" aria-label="Default select example" name="warranty" >
        <option selected>Select Warranty</option>
        <option value="6 months">6 months</option>
        <option value="12 months">12 months</option>
        <option value="2 years">2 years</option>
        <option value="3 years">3 years</option>
        <option value="5 years">5 years</option>
    </select>
    </div>
    <div class="form-check">
        <input class="form-check-input" type="radio" name="returnPolicy" id="returnPolicy" value="Accepted">
        <label class="form-check-label" for="returnPolicy">
            Accept the Return Policy
        </label>
    </div>

    <div align="center">
        <button class="btn btn-success" type="submit">Submit</button>
    </div>
</form>
</div>
</div>
</body>
</html>
