// Menu sticky
window.onscroll = function() {stickyNav()};

var navbar = document.querySelector("nav");
var sticky = navbar.offsetTop;

function stickyNav() {
  if (window.pageYOffset >= sticky) {
    navbar.classList.add("sticky");
  } else {
    navbar.classList.remove("sticky");
  }
}

// Défilement fluide pour les sections du menu
document.querySelectorAll('a[href^="#"]').forEach(anchor => {
    anchor.addEventListener('click', function(e) {
        e.preventDefault();

        document.querySelector(this.getAttribute('href')).scrollIntoView({
            behavior: 'smooth'
        });
    });
});

// Bouton "Retour en haut"
var toTopButton = document.createElement('button');
toTopButton.innerHTML = "↑";
toTopButton.id = "toTopButton";
document.body.appendChild(toTopButton);

window.onscroll = function() {scrollFunction()};

function scrollFunction() {
    if (document.body.scrollTop > 300 || document.documentElement.scrollTop > 300) {
        toTopButton.style.display = "block";
    } else {
        toTopButton.style.display = "none";
    }
}

toTopButton.addEventListener('click', function() {
    window.scrollTo({ top: 0, behavior: 'smooth' });
});
