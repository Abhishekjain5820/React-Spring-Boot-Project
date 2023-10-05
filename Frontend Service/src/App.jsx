
import './App.css'
import AddEmployee from './components/AddEmployee'
import EmployeeList from './components/EmployeeList'
import UpdateEmployee from './components/UpdateEmployee'
import Header from './components/Header'
import {Routes,Route} from 'react-router-dom'
function App() {
  

  return (
    <>
      <Header/>
      <Routes>
        <Route index element={<EmployeeList/>}/>
        <Route path='/' element={<EmployeeList/>}/>
        <Route path='/employeeList' element={<EmployeeList/>}/>
        <Route path='/addEmployee' element={<AddEmployee/>}/>
        <Route path="/editEmployee/:id" element={<UpdateEmployee />} />
      </Routes>
     
    </>
  )
}

export default App
