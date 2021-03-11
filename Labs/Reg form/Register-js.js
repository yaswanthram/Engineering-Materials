const registerForm = document.getElementById("register-form");
const registerButton = document.getElementById("register-submit");

registerButton.addEventListener("click", (e) => {
    e.preventDefault();
    const name = registerForm.name.value;
    const username = registerForm.username.value;
    const password = registerForm.password.value;
    const repassword = registerForm.repassword.value;
    const phone = registerForm.phone.value;
    const email = registerForm.email.value;

    if (name == '') {
    	registerForm.name.placeholder = "Enter Your Name";
    	registerForm.name.classList.toggle("register-field-error");
    }
    if (username == '') {
    	registerForm.username.placeholder = "Enter a Username";
    	registerForm.username.classList.toggle("register-field-error");
    }
    if (password == '') {
    	registerForm.password.placeholder = "Enter a Password";
    	registerForm.password.classList.toggle("register-field-error");
    }
    if (repassword == '') {
    	registerForm.repassword.placeholder = "Enter Your Password";
    	registerForm.repassword.classList.toggle("register-field-error");
    }
    else if (repassword != password){
    	registerForm.repassword.placeholder = "Passwords do not match";
    	registerForm.sspassword.placeholder = "Passwords do not match";
    	registerForm.repassword.classList.toggle("register-field-error");
    	registerForm.repassword.value = '';
    	registerForm.password.value = ''
    }
    if (phone == '') {
    	registerForm.phone.placeholder = "Enter Your Phone No";
    	registerForm.phone.classList.toggle("register-field-error");
    }
    else if ((phone.toString().length) != 10) {
    	registerForm.phone.placeholder = "Enter correct Phone No";
    	registerForm.phone.value = ''
    	registerForm.phone.classList.toggle("register-field-error");
    }
    if (email == '') {
    	registerForm.email.placeholder = "Enter Your Email-Id";
    	registerForm.email.classList.toggle("register-field-error");
    }
    else if (!email.includes("@")) {
    	registerForm.email.placeholder = "Enter correct Email-Id";
    	registerForm.email.value = ''
    	registerForm.email.classList.toggle("register-field-error");
    }
})