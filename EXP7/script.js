document.addEventListener('DOMContentLoaded', () => {
  const toggle = document.getElementById('navToggle');
  const links = document.getElementById('navLinks');

  toggle.addEventListener('click', () => links.classList.toggle('open'));
  links.querySelectorAll('a').forEach(a => a.addEventListener('click', () => links.classList.remove('open')));

  // Highlight the nav link matching the current page
  const current = window.location.pathname.split('/').pop() || 'index.html';
  links.querySelectorAll('a[href]').forEach(a => {
    const href = a.getAttribute('href');
    if (href === current || (current === '' && href === 'index.html')) {
      a.classList.add('active');
    }
  });

  // Contact form: build a pre-filled mailto so "Send message" goes somewhere real
  const form = document.getElementById('contactForm');
  if (form) {
    form.addEventListener('submit', (e) => {
      e.preventDefault();
      const name = document.getElementById('name').value;
      const email = document.getElementById('email').value;
      const msg = document.getElementById('msg').value;
      const subject = encodeURIComponent(`Portfolio contact from ${name}`);
      const body = encodeURIComponent(`${msg}\n\nFrom: ${name} (${email})`);
      window.location.href = `mailto:khanrahmanuddin@eng.rizvi.edu.in?subject=${subject}&body=${body}`;
    });
  }
});
