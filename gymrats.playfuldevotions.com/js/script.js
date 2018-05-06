var percentages = document.querySelectorAll('.goal p');
Array.prototype.forEach.call(percentages, function(el, i) {
    var percent = parseInt(el.textContent);

    var bar = document.querySelector('.bar'+i);
    var percentOffset = ((100-percent)/100)*(Math.PI*(90*2));
    bar.setAttribute('stroke-dashoffset', percentOffset);
});