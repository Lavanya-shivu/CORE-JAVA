<html>
<head>
    <title>Donation</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body>
<table class="table table-dark table-striped">
    <thead>
    <h1 align="center">Thank You For Donating!</h1>
    <tr>
        <th scope="col">Field</th>
        <th scope="col">Values</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>Name</td>
        <td>${dto.name}</td>
    </tr>
    <tr>
        <td>Contact Number</td>
        <td>${dto.contactNumber}</td>
    </tr>
    <tr>
        <td>Email</td>
        <td>${dto.email}</td>
    </tr>
    <tr>
        <td>Cause</td>
        <td>${dto.cause}</td>
    </tr>
    <tr>
        <td>Amount</td>
        <td>${dto.amount}</td>
    </tr>
</table>
</body>
</html>