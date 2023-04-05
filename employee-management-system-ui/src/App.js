import Navbar from "./components/Navbar";
import AddEmployee from "./components/AddEmployee";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import EmployeeList from "./components/EmployeeList";

export default function App() {
  return (
    <>

    <BrowserRouter>
     <Navbar/>
     <Routes>
    
      <Route index element={<EmployeeList />}/>
      <Route path="/" element={<EmployeeList />}/>
      <Route path="/employeeList" element={<EmployeeList />}></Route>
      <Route path="/addEmployee" element={<AddEmployee />}></Route>
     </Routes>
    </BrowserRouter>
   
    </>
  )
}