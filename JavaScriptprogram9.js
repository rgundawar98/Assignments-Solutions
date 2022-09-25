//Get and set method in javascript
const student = {
	firstName: 'Monica',
	get getName()
	{
		return this.firstName;
	}

	set changeName()
	{
		this.firstName = newName;
	}
};

console.log(student.firstName);

console.lo(student.getName);

student.changeName= 'Stella';
console.log(student.firstName);