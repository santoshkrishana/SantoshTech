function reverseWord(word) {
    return word.split('').reverse().join('');
}

const inputWord = "srikakulam is a district";
const reversedWord = reverseWord(inputWord);
console.log(reversedWord);