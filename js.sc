@@ -0,0 +1,6 @@
document.addEventListener('DOMContentLoaded', () => {
    const toggle = document.querySelector('.theme-toggle');
    toggle.addEventListener('click', () => {
        document.body.classList.toggle('dark-theme-variables');
    });
});
