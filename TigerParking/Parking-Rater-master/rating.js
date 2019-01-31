const form = document.querySelector('#rating-submit');

form.addEventListener('submit', (e) => {
		e.preventDefault();
		db.collection('Parking Lot').doc(form.lot.value).collection('Rating').add({
			score: parseInt(form.score.value, 10),
			time: new Date(),
			user_id: "not defined yet"
	});
})