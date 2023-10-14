import axios from "axios";

const BASE_URL= "http://localhost:8080/employee";

class EmployeeService
{
    getAllEmployee()
    {
        return axios.get(BASE_URL);
    }

    saveEmployee(employeeData)
    {
        return axios.post(BASE_URL, employeeData);
    }
}

export default new EmployeeService();