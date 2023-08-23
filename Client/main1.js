console.log("hello")
document.getElementById('button').addEventListener('click',(e)=>
{
    e.preventDefault()
const FirstName = document.getElementById('first').value
const LastName = document.getElementById('second').value
const Email = document.getElementById('third').value
const Password = document.getElementById('fourth').value
const ConfirmPassword = document.getElementById('fifth').value
console.log(FirstName,LastName,Email,Password,ConfirmPassword)
})

