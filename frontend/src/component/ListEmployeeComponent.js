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
                <thead>
                    <th>Employee ID</th>
                    <th>Employee First Name</th>
                    <th>Employee Last Name</th>
                    <th>Employee Email</th>
                    <th>Actions</th>
                </thead>
                <tbody>
                </tbody>
            </table>
        </div>
    )
}

export default ListEmployeeComponent