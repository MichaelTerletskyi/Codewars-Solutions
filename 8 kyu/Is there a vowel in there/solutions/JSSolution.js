function isVow(a) {
    let arr = [];
    a.forEach(e => {
        let ch = String.fromCharCode(e);
        arr.push((ch === 'a' || ch === 'e' || ch === 'i' || ch === 'o' || ch === 'u') ? ch : e);
    });
    return arr;
}