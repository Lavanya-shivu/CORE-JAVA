<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Donation Success</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO" crossorigin="anonymous"></script>
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
        <a class="navbar-brand" href="#">Navbar</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
                </li>
            </ul>
        </div>
    </div>
</nav>
<div class="container d-flex justify-content-center align-items-center min-vh-100">
    <div class="card p-4 shadow" style="width: 100%; max-width: 500px;">
        <div class="text-center">
    <h1>Donate Here</h1>
        </div>
    <form action="donate" method="post">
        <div class="mb-3">
            <label for="name" class="form-label">Name</label>
            <input type="text" class="form-control" id="name" name="name" placeholder="Enter Your Name">
        </div>
        <div class="mb-3">
            <label for="contactnumber" class="form-label">Contact Number</label>
            <input type="text" class="form-control" id="contactnumber" name="contactnumber" placeholder="Enter Contact Number">
        </div>
        <div class="mb-3">
            <label for="email" class="form-label">Email</label>
            <input type="text" class="form-control" id="email" name="email" placeholder="Enter Your Email">
        </div>
        <div class="mb-3">
            <label for="cause" class="form-label">Cause</label>
            <input type="text" class="form-control" id="cause" name="cause" placeholder="Type the Cause">
        </div>
        <div class="mb-3">
            <label for="amount" class="form-label">Amount</label>
            <input type="text" class="form-control" id="amount" name="amount" placeholder="Enter The Amount">
        </div>
        <div class="text-center">
        <button class="btn btn-success" type="submit">Donate</button>
        </div>
    </form>
</div>
</div>
</body>
</html>