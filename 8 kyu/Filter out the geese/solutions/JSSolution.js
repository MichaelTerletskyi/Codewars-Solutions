function gooseFilter(birds) {
    let res = [];
    for (let i = 0; i < birds.length; i++) {
        if (["African", "Roman Tufted", "Toulouse", "Pilgrim", "Steinbacher"].indexOf(birds[i]) < 0) {
            res.push(birds[i]);
        }
    }
    return res;
}