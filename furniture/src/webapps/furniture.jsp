<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Furniture</title>
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
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
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
      <h1>Find Your Favorite Furniture!</h1>
    </div>
    <form action="furniture" method="post">
      <div class="mb-3">
        <label for="brand" class="form-label">Brand</label>
        <input type="text" class="form-control" id="brand" name="brand" placeholder="Enter Brand Name">
      </div>

      <div class="mb-3">
        <label for="size" class="form-label">Size</label>
        <select class="form-select" id="size" name="size">
          <option selected disabled>Select Size</option>
          <option value="S">Small</option>
          <option value="M">Medium</option>
          <option value="L">Large</option>
          <option value="XL">Extra Large</option>
        </select>
      </div>

      <div class="mb-3">
        <label for="modelName" class="form-label">Model Name</label>
        <input type="text" class="form-control" id="modelName" name="modelName" placeholder="Enter Model Name">
      </div>

      <div class="mb-3">
        <label for="material" class="form-label">Material</label>
        <input type="text" class="form-control" id="material" name="material" placeholder="Enter Type of Material">
      </div>

      <div class="mb-3">
        <label for="comments" class="form-label">Comments</label>
        <textarea class="form-control" id="comments" name="comments" placeholder="Leave a comment here" style="height: 100px"></textarea>
      </div>

      <button class="btn btn-success w-100" type="submit">Submit</button>
      </form>
    </div>
  </div>
</div>
</body>
</html>