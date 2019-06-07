SELECT * FROM classicmodels.categories;

SELECT   
  child AS category_id,
    parent AS parent_id,
    (SELECT name FROM categories WHERE category_id = child) as name,
    (SELECT name FROM categories WHERE category_id = parent) as parent_name
FROM (
SELECT
        min(category_id) AS child,
        parent_id AS parent
    FROM
        categories
    WHERE
        parent_id IS NOT NULL
    GROUP BY
        parent_id
    UNION
    SELECT
        min(category_id) AS child,
        parent_id AS parent
    FROM
        categories
    WHERE
        parent_id IS NOT NULL
        AND category_id NOT IN
        (
            SELECT
                min(category_id) AS child
            FROM
                categories
            WHERE
                parent_id IS NOT NULL
            GROUP BY
                parent_id
        )
    GROUP BY
        parent_id
    ORDER BY
        child ASC,
        parent ASC
 ) ;

//SQL QUERY
insert into categories  values('category_id','name','parent_id');
insert into categories  values('1','category1','NULL');
insert into categories  values('2','subcategory1','1');
insert into categories  values('3','category2','NULL');
insert into categories  values('4','subcategory2','1');
insert into categories  values('5','subcategory4',' NULL');
insert into categories  values('6','subcategory3','1');
insert into categories  values('7','subcategory8 ',' NULL');
insert into categories  values('8','subcategory9 ','5');
insert into categories  values('9','subcategory5 ','6');
insert into categories  values('10','subcategory10','6');
insert into categories  values('11','subcategory13','6');
insert into categories  values('12','subcategory6 ','4');
insert into categories  values('13','subcategory7','4');
insert into categories  values('14','subcategory12','4');
insert into categories  values('15','subcategory17','4');
insert into categories  values('16','subcategory10','4');
insert into categories  values('17','subcategory19','4');



