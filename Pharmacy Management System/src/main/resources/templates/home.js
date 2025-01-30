// Mobile Menu Toggle
const mobileMenu = document.getElementById('mobile-menu');
const navLinks = document.querySelector('.nav-links');

mobileMenu.addEventListener('click', () => {
    navLinks.classList.toggle('active');
    mobileMenu.classList.toggle('active');
});

// Logout Functionality
document.getElementById('logout').addEventListener('click', () => {
    alert('You have been logged out.');
    window.location.href = 'index.html';
});