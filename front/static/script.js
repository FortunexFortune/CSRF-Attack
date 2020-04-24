const form = document.querySelector('.formDiv');
const progressBar = document.getElementById('progressBar');


form.addEventListener('submit', e => {
    e.preventDefault();

    console.log(form.first_name.value);
    console.log(form.currency_field.value);

    progressBar.setAttribute('class', 'indeterminate');

    setTimeout(function () {
        progressBar.setAttribute('class', 'progressBar');
    }, 5000);











});

// document.forms[0].submit();
