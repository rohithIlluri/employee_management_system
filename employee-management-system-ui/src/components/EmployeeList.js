import React from 'react'

function EmployeeList() {
  return (
    <div className='container mx-auto my-8 '>
    <div className='h-12'>
      <button className='rounded bg-slate-600 text-white px-6 py-2 font-semibold'>Add Employee</button>
    </div>
    <div className='flex shadow border-b'>
      <table className='min-w-full'>
        <thead className='bg-gray-50'>
          <tr>
            <th className='text-left font-medium text-gray-500 uppercase tracking-wider'>First Name </th>
            <th>Last Name </th>
            <th>Email ID</th>
            <th>Actions</th>
          </tr>
        </thead>
      </table>
    </div>
    </div>
  )
}

export default EmployeeList;