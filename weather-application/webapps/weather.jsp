<!Doctype html>
<html lang ="en">
<head>
    <meta charset="UTF-8">
    <title>Weather Details</title>
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
            <h1>Check Weather!</h1>
        </div>
        <h3 class="text-danger" align="center">${message}</h3>
        <form action="weather" method="post">
            <div class="mb-3">
                <label for="placeName" class="form-label">Place Name</label>
                <input type="text" class="form-control" id="placeName" name="placeName" placeholder="Enter Place Name">
            </div>
            <div class="mb-3">
                <label for="weather" class="form-label">Weather</label>
                <input type="text" class="form-control" id="weather" name="weather" placeholder="Enter Weather">
            </div>
            <div class="mb-3">
                <label for="minTemp" class="form-label">Min Temperature</label>
                <input type="number" class="form-control" id="minTemp" name="minTemp" placeholder="Min Temperature">
            </div>
            <div class="mb-3">
                <label for="maxTemp" class="form-label">MAx Temperature</label>
                <input type="number" class="form-control" id="maxTemp" name="maxTemp" placeholder="Enter Max Temperature">
            </div>
            <div class="mb-3">
                <label class="form-label">Cloudy</label>
                <select class="form-select" name= "cloudy" aria-label="Default select example">
                    <option selected>Open this select type</option>
                    <option value="Yes">Yes</option>
                    <option value="No">No</option>
                </select>
            </div>
            <div class="mb-3">
                <label class="form-label">Rainy</label>
                <select class="form-select" name= "rainy" aria-label="Default select example">
                    <option selected>Open this select type</option>
                    <option value="Yes">Yes</option>
                    <option value="No">No</option>
                </select>
            </div>
            <div class="mb-3">
                <label for="rainInMM" class="form-label">Rainy in MM</label>
                <input type="number" class="form-control" id="rainInMM" name="rainInMM" placeholder="Enter Rain in MM">
            </div>
            <div class="mb-3">
                <label for="humidity" class="form-label">Humidity</label>
                <input type="number" class="form-control" id="humidity" name="humidity" placeholder="Enter Humidity">
            </div>
            <div class="mb-3">
                <label for="windSpeed" class="form-label">Wind Speed</label>
                <input type="number" class="form-control" id="windSpeed" name="windSpeed" placeholder="Enter  Wind Speed">
            </div>
            <div class="mb-3">
                <label for="sunRiseTime" class="form-label">SunRise Time</label>
                <input type="time" class="form-control" id="sunRiseTime" name="sunRiseTime" placeholder="Enter SunRise Time">
            </div>
            <div class="mb-3">
                <label for="sunSetTime" class="form-label">SunSet Time</label>
                <input type="time" class="form-control" id="sunSetTime" name="sunSetTime" placeholder="Enter Set Time">
            </div>
            <div class="mb-3">
                <label for="moonRiseTime" class="form-label">MoonRise Time</label>
                <input type="time" class="form-control" id="moonRiseTime" name="moonRiseTime" placeholder="Enter MoonRise Time">
            </div>
            <div class="mb-3">
                <label for="moonSetTime" class="form-label">MoonSet Time</label>
                <input type="time" class="form-control" id="moonSetTime" name="moonSetTime" placeholder="Enter MoonSet Time">
            </div>
            <div class="mb-3">
                <label for="rainStartTime" class="form-label">Rain Start Time</label>
                <input type="time" class="form-control" id="rainStartTime" name="rainStartTime" placeholder="Enter Rain Start Time">
            </div>
            <div class="mb-3">
                <label for="rainEndTime" class="form-label">Rain End Time</label>
                <input type="time" class="form-control" id="rainEndTime" name="rainEndTime" placeholder="Enter Rain End Time">
            </div>
            <div class="mb-3">
                <label for="precipitation" class="form-label">Precipitation</label>
                <input type="number" class="form-control" id="precipitation" name="precipitation" placeholder="Enter Precipitation">
            </div>
            <div align="center">
                <button class="btn btn-success" type="submit">Submit</button>
            </div>
        </form>
    </div>
</div>
</body>
</html>