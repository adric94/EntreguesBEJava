// 1 
db.Restaurants.find(  {});
// 2 
db.Restaurants.find(  {},{restaurant_id:1, name:1, borough:1, cuisine:1});
//3
db.Restaurants.find(  {},{_id:0, restaurant_id:1, name:1, borough:1, cuisine:1});
//4
db.Restaurants.find(  {},{_id:0, restaurant_id:1, name:1, borough:1, 'address.zipcode':1});
//5
db.Restaurants.find(    {borough: 'Bronx'}  );
//6
db.Restaurants.find(    {borough: 'Bronx'}  ).limit(5);
//7
db.Restaurants.find(    {borough: 'Bronx'}  ).limit(5).skip(5);
//8
db.Restaurants.find(    {'grades.score': {$gt: 90}}  );
//9
db.Restaurants.find(    {'grades.score': {$gt: 80, $lt: 100 }}  );
//10
db.Restaurants.find(    {'address.coord.0': {$lt: -95.754168}}  );
//11
db.Restaurants.find(    {'address.coord.0': {$lt: -65.754168},'grades.score': {$gt: 70},cuisine: {$ne: 'American '}}  );
//12
db.Restaurants.find(    {'address.coord.1': {$lt: -65.754168},'grades.score': {$gt: 70},cuisine: {$ne: 'American '}}  );
//13
db.Restaurants.find(    {'grades.grade': 'A',borough: {$ne: 'Brooklyn'},cuisine: {$ne: 'American '}} ).sort({cuisine:-1});
//14
db.restaurants.find(    { name: /^Wil/ }, { restaurant_id: 1, name: 1, borough: 1, cuisine: 1 }  );
//15
db.restaurants.find(    { name: /ces$/ }, { restaurant_id: 1, name: 1, borough: 1, cuisine: 1 }  );
//16
db.restaurants.find(    { name: /.*Reg.*/i }, { restaurant_id: 1, name: 1, borough: 1, cuisine: 1 }  );
//17
db.restaurants.find(    { borough: 'Bronx', $or: [{ cuisine:'American ' }, { cuisine: 'Chinese' }] }  );
//18
db.restaurants.find(    { borough: { $in: ['Staten Island', 'Queens', 'Bronx', 'Brooklyn'] } }, { restaurant_id: 1, name: 1, borough: 1, cuisine: 1 }   );
//19
db.restaurants.find(    { borough: { $nin: ['Staten Island', 'Queens', 'Bronx', 'Brooklyn'] } }, { restaurant_id: 1, name: 1, borough: 1, cuisine: 1 });
//20
db.restaurants.find(    {'grades.score': { $lte: 10 } }, { restaurant_id: 1, name: 1, borough: 1, cuisine: 1 }  );
//21
db.restaurants.find(    { $or: [{ $and: [{ cuisine: { $ne: 'American '} }, { cuisine: { $ne: 'Chinese' } }, { cuisine: { $eq: 'Seafood' } }] }, { name: { $regex: '^Wil' } }] }, { restaurant_id: 1, name: 1, borough: 1, cuisine: 1 }  );
//22
db.restaurants.find(    { grades: { $elemMatch: { grade: 'A', score: 11, date: ISODate('2014-08-11T00:00:00Z') } } }, { restaurant_id: 1, name: 1, grades: 1 } );
//23
db.restaurants.find(    { 'grades.1.grade': 'A', 'grades.1.score': 9, 'grades.1.date': ISODate('2014-08-11T00:00:00Z') }, { restaurant_id: 1, name: 1, grades: 1 } );
//24
db.restaurants.find(    { 'address.coord.1': { $gt: 42, $lte: 52 } }, { restaurant_id: 1, name: 1, address: 1 } );
//25
db.restaurants.find(    ).sort({ name: 1 });
//26
db.restaurants.find(    ).sort({ name: -1 });
//27
db.restaurants.find(    ).sort({ cuisine: 1, borough: -1 });
//28
db.restaurants.find(    { 'address.street': { $exists: false } }).COUNT; db.restaurants.find({ 'address.street': { $exists: true } }).COUNT;
//29
db.restaurants.find(    { 'address.coord': { $type: 'double' } });
//30
db.restaurants.find(    { 'grades.score': { $mod: [7, 0] } }, { restaurant_id: 1, name: 1, grades: 1 } );



