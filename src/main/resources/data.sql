INSERT INTO ml_app_consultorio.physician (id, name)
VALUES (0, 'Robert Fisher'),
       (1, 'Jeremy Jenkins'),
       (2, 'Alex Katunich');

INSERT INTO ml_app_consultorio.patient
VALUES (0, 'Alan Viera'),
       (1, 'Nehuen Penzotti'),
       (2, 'Paul Jackson'),
       (3, 'Sheila Robles');

INSERT INTO ml_app_consultorio.schedule
VALUES (0, '09:00:00', '09:30:00'),
       (1, '09:30:00', '10:00:00'),
       (2, '10:00:00', '10:30:00'),
       (3, '10:30:00', '11:00:00'),
       (4, '11:00:00', '11:30:00'),
       (5, '11:30:00', '12:00:00');

INSERT INTO ml_app_consultorio.physician_schedule
VALUES (0, 0),
       (0, 1),
       (1, 2),
       (1, 3),
       (2, 4),
       (2, 5);

INSERT INTO ml_app_consultorio.appointment
VALUES (0, 0, 0, 0),
       (1, 1, 0, 1),
       (2, 1, 1, 0),
       (3, 2, 2, 2);



