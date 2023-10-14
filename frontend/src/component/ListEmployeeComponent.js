import axios from 'axios';
import React, {useEffect, useState } from 'react'
import { Link } from "react-router-dom";
import EmployeeService from "../service/EmployeeService";

const ListEmployeeComponent = () =>
{
    const [employeeArray, setEmployeeArray] = useState([]);
    useEffect(() =>
    {
        getAllEmployee();
    }, []);

    function getAllEmployee ()
    {
        EmployeeService.getAllEmployee()
        .then
        (
            res =>
            {
                setEmployeeArray(res.data);
                console.log(res)
            }
        )
        .catch
        (
            e => console.log(e)
        );
    }

    return (
        <div className='container'>
            <Link to={"/add-employee"} className='btn btn-dark mb-5 mt-5 align-items-lg-center' href="">Add New Employee</Link>
            <h2 className='text-center mb-4 mt-4 '>List of Employees</h2>
            <table className='table table-bordered table striped'>
                <thead className='text-center'>
                    <th>ID</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Email</th>
                    <th>Actions</th>
                </thead>
                <tbody className='text-center'>
                    {
                        employeeArray.map
                        (
                            employee =>
                            <tr id={employee.id}>
                                <td>{employee.id}</td>
                                <td>{employee.firstName}</td>
                                <td>{employee.lastName}</td>
                                <td>{employee.email}</td>
                                <td>
                                    <a className="btn btn-warning" href="">Update</a> {" "}
                                    <a className="btn btn-danger" href="">Delete</a>
                                </td>
                            </tr>
                        )
                    }
                </tbody>
            </table>
        </div>
    )
}

export default ListEmployeeComponent