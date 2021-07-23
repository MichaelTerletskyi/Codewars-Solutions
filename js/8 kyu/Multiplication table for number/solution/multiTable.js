// My Solution
function multiTable(number) {
    let table = '';
    for (let index = 1; index <= 10; index++) {
        let rowTemp = index + ' * ' + number + ' = ' + (index * number);
        if (index !== 10) {
            table +=  (rowTemp += '\n');
        } else {
            table += rowTemp;
        }
    }
    return table;
}

// Best Solution
// function multiTable(number) {
//     for(let i = 1; i <= 10; i++) {
//         table += `${i} * ${number} = ${i * number}${i < 10 ? '\n' : ''}`;
//     }
// }
