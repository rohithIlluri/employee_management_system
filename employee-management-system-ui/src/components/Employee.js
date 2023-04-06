import React from 'react'

const Employee = ({employee}) => {
  return (
    <div> <tr className='bg-white'>
    <tr key={employee.id}></tr>
    <td className='text-left px-6 py-4 whitespace-nowrap'>
      <div className='text-sm text-gray-500'>{employee.firstName}</div>
    </td>
    <td className='text-left px-6 py-4 whitespace-nowrap'>
      <div className='text-sm text-gray-500'>{employee.lastName}</div>
    </td>
    <td className='text-left px-6 py-4 whitespace-nowrap'>
      <div className='text-sm text-gray-500'>{employee.emailId}</div>
    </td>
    <td className='text-right px-6 py-4 font-medium text-sm whitespace-nowrap'>
      <a href='#' className='text-indigo-600 hover:text-indigo-800 px-4'>Edit</a>
      <a href='#'  className='text-indigo-600 hover:text-indigo-800 '>Delete</a>

    </td>
  </tr></div>
  )
}

export default Employee;