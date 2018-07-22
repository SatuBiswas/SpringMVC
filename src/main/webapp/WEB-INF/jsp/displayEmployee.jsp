<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table>
            <tr>
                <td>Name </td>
                <td>${employee.name}</td>
            </tr>
            <tr>
                <td>Address</td>
                <td>${employee.address}</td>
            </tr>
            <tr>
                <td>Name </td>
                <td>${employee.empMob}</td>
            </tr>
            <tr>
                <td>Name </td>
                <td>${employee.skills}</td>
            </tr>
            <tr>
                <td>Name </td>
                <td>${employee.empDate}</td>
            </tr>
            <tr>
                <td>Department Id</td>
                <td>${employee.department.deptId}</td>
            </tr>
            <tr>
                <td>Department Name</td>
                <td>${employee.department.deptName}</td>
            </tr>
        </table>
    </body>
</html>
