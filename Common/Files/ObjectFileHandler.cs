using MindC.Common.Files.ObjectFiles;
using Newtonsoft.Json;

namespace MindC.Common.Files
{
    public class ObjectFileHandler
    {
        public ObjectFile ObjectFile;

        public ObjectFileHandler(string json)
        {
            ObjectFile = JsonConvert.DeserializeObject<ObjectFile>(json)!;
        }
    }
}