document.getElementById("survey-form").addEventListener("submit", function(event) {
    event.preventDefault();

    const firstName = document.getElementById("first-name").value;
    const lastName = document.getElementById("last-name").value;
    const dateOfBirth = document.getElementById("date-of-birth").value;
    const country = document.getElementById("country").value;
    const gender = document.querySelectorAll("input[name='gender']:checked");
    const profession = document.getElementById("profession").value;
    const email = document.getElementById("email").value;
    const mobile = document.getElementById("mobile").value;

    // Display the data in the popup
    document.getElementById("popup-first-name").textContent = firstName;
    document.getElementById("popup-last-name").textContent = lastName;
    document.getElementById("popup-date-of-birth").textContent = dateOfBirth;
    document.getElementById("popup-country").textContent = country;
    document.getElementById("popup-gender").textContent = [...gender].map(checkbox => checkbox.value).join(", ");
    document.getElementById("popup-profession").textContent = profession;
    document.getElementById("popup-email").textContent = email;
    document.getElementById("popup-mobile").textContent = mobile;

    // Show the popup
    document.getElementById("popup").style.display = "block";
});

document.getElementById("close-popup").addEventListener("click", function() {
    // Close the popup and reset the form
    document.getElementById("popup").style.display = "none";
    document.getElementById("survey-form").reset();
});