import axios from "axios";

const EMPLOYEE_API_BASE_URL = "http://localhost:1234/api/v1/employees"

class EmployeeService {

    saveEmployee(employee){
        return axios.post(EMPLOYEE_API_BASE_URL, employee);
    }

    getEmployees(){
        return axios.get(EMPLOYEE_API_BASE_URL);
    }

    deleteEmployee(id){
        axios.delete(EMPLOYEE_API_BASE_URL + "/" + id);
    };

    getEmployeeById(id){
        return axios.get(EMPLOYEE_API_BASE_URL + "/" + id);
    }

    updateEmployee(employee, id){
        return axios.put(EMPLOYEE_API_BASE_URL + "/" + id);
    }

};

export default new EmployeeService();