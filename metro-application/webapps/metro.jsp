<!Doctype html>
<html lang ="en">
<head>
    <meta charset="UTF-8">
    <title>Weather Forecast</title>
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
                <a class="nav-link active" aria-current="page" href="#">Home</a>
                <a class="nav-link active" aria-current="page" href="weather.jsp">Weather</a>
            </div>
        </div>
    </div>
</nav>
<div class="container d-flex justify-content-center align-items-center min-vh-100">
    <div class="card p-4 shadow" style="width: 110%; max-width: 500px;">
        <div align="center">
            <h1>Book Metro!</h1>
        </div>
<h3 class="text-danger" align="center">${message}</h3>
        <form action = "metro" method="post">
            <div class="mb-3">
                <label for="name" class="form-label">Name</label>
                <input type="text" class="form-control" id="name" name="name" placeholder="Enter Your Name">
            </div>
            <div class="mb-3">
                <label for="datetime">Date and Time:</label>
                <input type="datetime-local" id="datetime" class="form-control" name="dateAndTime" required>
            </div>
            <div class="mb-3">
                <label class="form-label">From</label>
                <select class="form-select" aria-label="Default select example">
                    <option selected>Open this select From</option>
                    <option value="1">Banashankari</option>
                    <option value="2">Jayanagara</option>
                    <option value="3">Mejastic</option>
                    <option value="4">Yeshwanthpur</option>
                </select>
            </div>
            <div class="mb-3">
                <label class="form-label">To</label>
                <select class="form-select" aria-label="Default select example">
                    <option selected>Open this select To</option>
                    <option value="1">Banashankari</option>
                    <option value="2">Jayanagara</option>
                    <option value="3">Mejastic</option>
                    <option value="4">Yeshwanthpur</option>
                </select>
            </div>
            <div class="mb-3">
                <label for="noOfTickets" class="form-label">Number of Tickets</label>
                <input type="number" class="form-control" id="noOfTickets" name="noOfTickets" placeholder="Enter Number of Tickets">
            </div>
            <div class="mb-3">
                <label class="form-label">Are You Student?</label>
                <select class="form-select" aria-label="Default select example">
                    <option selected>Open this select</option>
                    <option value="1">Yes</option>
                    <option value="2">No</option>
                </select>
            </div>
            <div align="center">
<button class="btn btn-success" type="submit">Buy Now</button>

            </div>

        </form>
    </div>
</div>
</body>
</html>