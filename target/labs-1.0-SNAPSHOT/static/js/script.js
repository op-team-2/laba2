function setFormValue() {
    let cookies = document.cookie.split(';');
    for(let i = 0; i < cookies.length; i++) {
        let cookie = cookies[i].trim();
        if(cookie.indexOf("a=") === 0) document.getElementById("a").value = cookie.substring(2);
        else if (cookie.indexOf('b=') === 0) document.getElementById("b").value = cookie.substring(2);
        else if (cookie.indexOf('c=') === 0) document.getElementById("c").value = cookie.substring(2);
        else if (cookie.indexOf('d=') === 0) document.getElementById("d").value = cookie.substring(2);
    }
}

setFormValue();

const isNumber = (value) => {
    return /^-?\d*\.?\d+$/.test(value);
}

const validationForm = () => {
    const a = document.getElementById("a").value,
          b = document.getElementById("b").value,
          c = document.getElementById("c").value,
          d = document.getElementById("d").value;

    return !(!isNumber(a) || !isNumber(b) || !isNumber(c) || !isNumber(d));
}
