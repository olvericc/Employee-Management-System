import React, { useState, useEffect } from 'react'
import EmployeeService from "../service/EmployeeService";
import { Link, useNavigate, useParams } from "react-router-dom";

const AddEmployeeComponent = () =>
{
    const
    [
        firstName,
        setFirstName
    ] = useState('');

    const
    [
        lastName,
        setLastName
    ] = useState('');

    const
    [
        email,
        setEmail
    ] = useState('');

    const navigate = useNavigate();

    const {id} = useParams();

    const employeeData = {firstName, lastName, email};

    function saveEmployee(event)
    {
        event.preventDefault();

        if (employeeData.firstName !== "" && employeeData.lastName !== "" && employeeData.email !== "")
        {
            EmployeeService.saveEmployee(employeeData)
            .then(navigate("/employee"))
            .catch(event => console.log(event))
        }
        else
        {
            alert("Please, fill in all inputs!")
        }
    }

    function changeTitle()
    {
        if (id)
        {
            return "Update Employee";
        }
        else
        {
            return "Add Employee";
        }
    }

    useEffect(() =>
        {
            if (id)
            {
                EmployeeService.getEmployeeById(id)
                .then
                (
                    result =>
                    {
                        setFirstName(result.data.firstName);
                        setLastName(result.data.lastName);
                        setEmail(result.data.email);
                    }
                )
                .catch
                (
                    event =>
                    {
                        console.log(event);
                        alert(event);
                    }
                );
            }
        }, []
    );

    return (
        <div>
            <div className='container mt-5'>
                <div className='row'>
                    <div className='card col-md-6 offset-md-3'>
                        <h2 className='text-center mt-3'>{changeTitle()}</h2>
                        <div className='card-body'>
                            <form>
                                <div className='form-group mb-3'>
                                    <input
                                        className='form-control'
                                        value={firstName}
                                        onChange=
                                            {
                                                (elem) => setFirstName
                                                (
                                                    elem.target.value
                                                )
                                            }
                                        type="text"
                                        placeholder='First Name' />
                                </div>
                                <div className='form-group mb-3'>
                                    <input
                                        className='form-control'
                                        onChange=
                                            {
                                                (elem) => setLastName
                                                (
                                                    elem.target.value
                                                )
                                            }
                                        value={lastName}
                                        type="text"
                                        placeholder='Last Name' />
                                </div>
                                <div className='form-group mb-5'>
                                    <input
                                        className='form-control'
                                        onChange=
                                            {
                                                (elem) => setEmail
                                                (
                                                    elem.target.value
                                                )
                                            }
                                        value={email}
                                        type="email"
                                        placeholder='Email' />
                                </div>
                                <button
                                    onClick=
                                        {
                                            (event) => saveEmployee(event)
                                        }
                                    className='btn btn-success'>Save</button> {" "}
                                <Link to={"/employee"} className='btn btn-danger'>Cancel</Link>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    )
}

export default AddEmployeeComponent