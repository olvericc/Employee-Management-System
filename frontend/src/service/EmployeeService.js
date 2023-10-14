import axios from "axios";

const BASE_URL= "http://localhost:8080/employee";

class EmployeeService
{
    getAllEmployee()
    {
        return axios.get(BASE_URL);
    }
}

export default new EmployeeService();