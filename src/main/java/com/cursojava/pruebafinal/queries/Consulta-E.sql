SELECT actor.first_name, actor.last_name, COUNT(film_actor.film_id) AS count FROM actor JOIN film_actor ON film_actor.actor_id=actor.actor_id JOIN film ON film.film_id=film_actor.film_id WHERE film.rating = 'PG' OR film.rating = 'PG13' OR film.rating = 'G' GROUP BY actor.actor_id ORDER BY count DESC;