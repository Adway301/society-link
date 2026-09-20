create database society_link;
use society_link;
show tables;
 
INSERT INTO product (name, description, category, is_available, stock_quantity) 
VALUES 
    ('JBL Speaker', 'JBL speaker with good sound quality.', 'Speaker', true, 2),
    ('Boat Speaker', 'Boat speaker with good sound quality.', 'Speaker', true, 1),
    ('Electric Pressure Washer', 'Perfect for washing cars, bikes, or cleaning dusty balcony floors.', 'Cleaning', true, 2),
    ('Hedge Trimmer', 'Essential for maintaining small garden patches or green common areas.', 'Gardening', true, 2),
    ('HD Projector', 'Awesome for hosting movie nights in the society club house or rooftop.', 'Technology', false, 2);