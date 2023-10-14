import React from 'react'

const AddEmployeeComponent = () =>
{
    return (
        <div>
            <div className='container mt-5'>
                <div className='row'>
                    <div className='card col-md-6 offset-md-3'>
                        <h2 className='text-center mt-3'>Add Employee</h2>
                        <div className='card-body'>
                            <form>
                                <div className='form-group mb-3'>
                                    <input className='form-control' type="text" placeholder='First Name' />
                                </div>
                                <div className='form-group mb-3'>
                                    <input className='form-control' type="text" placeholder='Last Name' />
                                </div>
                                <div className='form-group mb-5'>
                                    <input className='form-control' type="email" placeholder='Email' />
                                </div>
                                <button className='btn btn-success'>Save</button> {" "}
                                <a className='btn btn-danger' href="">Cancel</a>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    )
}

export default AddEmployeeComponent