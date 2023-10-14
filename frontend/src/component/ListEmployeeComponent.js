import React from 'react'

const ListEmployeeComponent = () =>
{
    return (
        <div className='container'>
            <a className='btn btn-dark mb-5 mt-5 align-items-lg-center' href="">Add New Employee</a>
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