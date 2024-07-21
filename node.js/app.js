setTimeout(() => {
  console.log('Done')
}, 0)

for (let i = 0; i < 10000000000; i++) {
  //block the thead pool or event loop or the worker pool
}
