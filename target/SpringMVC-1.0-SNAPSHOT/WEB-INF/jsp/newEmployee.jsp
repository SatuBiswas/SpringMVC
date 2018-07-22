<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Add New Employee</h1>
        <form:errors path="employee.*"/>
        <form action="" method="post">

            <table>
                <tr>
                    <td><label>Name</label></td>
                    <td><input type="text" name="name"/></td>
                </tr>
                <tr>
                    <td><label>Address</label></td>
                    <td><input type="text" name="address" /></td>
                </tr>
                <tr>
                    <td>Employee Mobile</td>
                    <td><input type="text" name="empMob" /></td>
                </tr>
                <tr>
                    <td>Employee Date</td>
                    <td><input type="text" name="empDate" /></td>
                </tr>
                <tr>
                    <td>Employee Skills</td>
                    <td>
                        <select name="skills" multiple>
                            <option>One</option>
                            <option>Two</option>
                            <option>Three</option>
                            <option>Four</option>
                            <option>Five</option>
                        </select>
                    </td>
                </tr>                
            </table>
            <table>
                <tr>
                    <td>Department Id</td>
                    <td><input type="text" name="department.deptId"/></td>
                </tr>
                <tr>
                    <td>Department Name</td>
                    <td><input type="text" name="department.deptName"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Submit" /></td>
                </tr>
            </table>
        </form>
    </body>
</html>
