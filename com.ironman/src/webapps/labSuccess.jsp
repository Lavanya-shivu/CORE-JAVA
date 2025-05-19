<html>
<head>
    <title>Laboratory</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body>
<table class="table table-success table-striped">
    <thead>
    <h1 align="center">Thank You for Visiting Lab</h1>
    <tr>
        <th scope="col">Field</th>
        <th scope="col">Value</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>Name</td>
        <td>${dto.name}</td>
    </tr>
    <tr>
        <td>Gender</td>
        <td>${dto.gender}</td>
    </tr>
    <tr>
        <td>Contact Number</td>
        <td>${dto.contactNumber}</td>
    </tr>

    <tr>
        <td>Age</td>
        <td>${dto.age}</td>
    </tr>
    </tbody>
</table>
</body>
</html>