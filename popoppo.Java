document.addEventListener('keydown', generateCode);

const codeLines = [
    '<span class="keyword">function</span> <span class="function">sayHello</span>() {',
    '  <span class="keyword">console</span>.<span class="function">log</span>("Hello, world!");',
    '}',
    '',
    '<span class="keyword">let</span> <span class="variable">x</span> = 10;',
    '<span class="keyword">let</span> <span class="variable">y</span> = 20;',
    '<span class="keyword">let</span> <span class="variable">z</span> = <span class="variable">x</span> + <span class="variable">y</span>;',
    '<span class="keyword">console</span>.<span class="function">log</span>(<span class="variable">z</span>);',
    '',
    '<span class="keyword">for</span> (<span class="keyword">let</span> <span class="variable">i</span> = 0; <span class="variable">i</span> < 10; <span class="variable">i</span>++) {',
    '  <span class="keyword">console</span>.<span class="function">log</span>(<span class="variable">i</span>);',
    '}',
    '',
    '<span class="keyword">if</span> (<span class="variable">x</span> > <span class="variable">y</span>) {',
    '  <span class="keyword">console</span>.<span class="function">log</span>("<span class="variable">x</span> is greater than <span class="variable">y</span>");',
    '} <span class="keyword">else</span> {',
    '  <span class="keyword">console</span>.<span class="function">log</span>("<span class="variable">x</span> is not greater than <span class="variable">y</span>");',
    '}',
    '',
    '<span class="comment">// This is a comment</span>',
    '<span class="comment">/* This is a multi-line comment */</span>',
    '<span class="keyword">const</span> <span class="variable">myArray</span> = [1, 2, 3, 4, 5];',
    '<span class="variable">myArray</span>.<span class="function">forEach</span>(<span class="variable">num</span> => {',
    '  <span class="keyword">console</span>.<span class="function">log</span>(<span class="variable">num</span>);',
    '});'
];

function generateCode() {
    const codeElement = document.getElementById('code');
    const randomLine = codeLines[Math.floor(Math.random() * codeLines.length)];
    codeElement.innerHTML += randomLine + '\n';
}
